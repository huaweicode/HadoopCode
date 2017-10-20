package com.temperature;

public interface PositionedReadable {
	
	public int read(long position,byte[] buffer,int offset,int length);
	public void readFully(long position,byte[] buffer,int offset,int length);
	public void readFully(long position,byte[] buffer);
}
