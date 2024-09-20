package com.pdd.pop.sdk.message.model;

/**
 * ISV处理的消息体
 */
public class Message {

	/**
	 * 消息类型
	 */
	private String type;
	/**
	 * 商户ID
	 */
	private Long mallID;
	/**
	 * 消息属性内容
	 */
	private String content;

	@Override
	public String toString() {
		return "Message{" +
				"type='" + type + '\'' +
				", mallID=" + mallID +
				", content='" + content + '\'' +
				'}';
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getMallID() {
		return mallID;
	}

	public void setMallID(Long mallID) {
		this.mallID = mallID;
	}
}
