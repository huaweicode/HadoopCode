package com.temperature;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.util.Progressable;

public class FileCopyWithProgress {

	public static void main(String[] args) throws IOException {
		String localSrc = args[0];
		String dSt = args[1];
		InputStream in = new BufferedInputStream(new FileInputStream(localSrc));
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(URI.create(dSt),conf);
		OutputStream out = fs.create(new Path(dSt), new Progressable() {
			@Override
			public void progress() {
				System.out.println(".");
			}
		});
		IOUtils.copyBytes(in, out, 4096,true);
	}
}
