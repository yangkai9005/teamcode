package main.java.com.fruitshop.back.po;

public class CommodityComments {
	private String commentId;//评论主键
	private String commentUserName;//评论的用户名称
	private String commentLevel;//评论等级
	private String commentDate;//评论时间
	public String getCommentId() {
		return commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getCommentUserName() {
		return commentUserName;
	}
	public void setCommentUserName(String commentUserName) {
		this.commentUserName = commentUserName;
	}
	public String getCommentLevel() {
		return commentLevel;
	}
	public void setCommentLevel(String commentLevel) {
		this.commentLevel = commentLevel;
	}
	public String getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}
	 
}
