package com.usps.data;

import java.util.List;

public class ManifestVO {
	
	private Header header;
	
	private List<Detail> details;
	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public List<Detail> getDetails() {
		return details;
	}
	public void setDetails(List<Detail> details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ManifestVO [header=" + header + ", details=" + details + "]";
	}
	
}
