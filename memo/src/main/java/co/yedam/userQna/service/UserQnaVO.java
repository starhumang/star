package co.yedam.userQna.service;

import java.util.Date;

public class UserQnaVO {
	private int qnaNo;
	private int userNo;
	private int productOrderNo;
	private int productNo;
	private String title;
	private String contents;
	private Date registDate;
	private int password;
	private String qnaReply;
	private char qnaState;
	
	
	public int getQnaNo() {
		return qnaNo;
	}
	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getProductOrderNo() {
		return productOrderNo;
	}
	public void setProductOrderNo(int productOrderNo) {
		this.productOrderNo = productOrderNo;
	}
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getRegistDate() {
		return registDate;
	}
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getQnaReply() {
		return qnaReply;
	}
	public void setQnaReply(String qnaReply) {
		this.qnaReply = qnaReply;
	}
	public char getQnaState() {
		return qnaState;
	}
	public void setQnaState(char qnaState) {
		this.qnaState = qnaState;
	}
}
