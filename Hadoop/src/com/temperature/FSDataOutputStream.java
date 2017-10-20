package com.temperature;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.Syncable;

public class FSDataOutputStream extends DataOutputStream implements Syncable {

	public FSDataOutputStream(OutputStream out) {
		super(out);
	}

	@Override
	public void sync() throws IOException {
		
	}
	
	private void createPath(){
		Path path = new Path("");
	}
}
