package com.temperature;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;

public class MaxTemprature {

	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.err.println("Usage : MaxTemprature <input path> <output path>");
			System.exit(-1);
		}
		JobConf conf = new JobConf(MaxTemprature.class);
		conf.setJobName("Max temprature");
		
		FileInputFormat.addInputPath(conf, new Path(args[0]));
		FileOutputFormat.setOutputPath(conf, new Path(args[1]));
		conf.setMapperClass(MaxTemperatureMapper.class);
		conf.setReducerClass(MaxTemperatureReducer.class);
		conf.setOutputKeyClass(Text.class);
		conf.setOutputValueClass(IntWritable.class);
		JobClient.runJob(conf);
	}
	
	private void readHooopUrl() throws MalformedURLException, IOException{
		InputStream inputStream = null;
		try {
			inputStream = new URL("").openStream();
		} finally {
			IOUtils.closeStream(inputStream);
		}
	}
}
