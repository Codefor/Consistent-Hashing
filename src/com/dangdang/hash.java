package com.dangdang;

public class hash {
	private String data;
	private String method;
	public hash(String _data){
		this.data = _data;
		this.method = "DJB";
	}
	
	public long generate(String _data){
		switch(this.method){
		case "DJB":
			return this.DJB(_data);
		}
		return 0;
	}
	
	public long DJB(String _data){
		return 0;
	}
}
