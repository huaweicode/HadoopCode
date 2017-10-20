package word;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.compress.CompressionCodec;
import org.apache.hadoop.io.compress.CompressionCodecFactory;
import org.apache.hadoop.io.compress.CompressionOutputStream;
import org.apache.hadoop.util.ReflectionUtils;

public class StreamCompressor {
    /**
     * —πÀı
     * @param args
     * @throws Exception 
     * @throws Exception
     */
	private void zip(String codeClassname) throws Exception{
		//String codeClassname = args[0];
		Class<?> codeClass = Class.forName(codeClassname);
		Configuration configuration = new Configuration();
		CompressionCodec codec = (CompressionCodec) ReflectionUtils.newInstance(codeClass, configuration);
		CompressionOutputStream out = codec.createOutputStream(System.out);
		IOUtils.copyBytes(System.in, out, 4096,false);
	}
	
	/**
	 * Ω‚—πÀı
	 * @param codeClassname
	 * @throws IOException 
	 */
	private void unZip(String uri) throws IOException{
		Configuration configuration = new Configuration();
		FileSystem fs = FileSystem.get(URI.create(uri),configuration);
		Path inputPath = new Path(uri);
		CompressionCodecFactory factory = new CompressionCodecFactory(configuration);
		CompressionCodec codec = factory.getCodec(inputPath);
		if (codec == null) {
			System.exit(1);
		}
		String outputUri = CompressionCodecFactory.removeSuffix(uri, codec.getDefaultExtension());
		InputStream in = null;
		OutputStream out = null;
		try{
			in = codec.createInputStream(fs.open(inputPath));
			out = fs.create(new Path(outputUri));
			IOUtils.copyBytes(in, out, configuration);
		} finally {
			IOUtils.closeStream(in);
			IOUtils.closeStream(out);
		}
	}
}
