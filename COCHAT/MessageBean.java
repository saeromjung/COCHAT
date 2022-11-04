package model.entity;

import java.io.Serializable;
import java.sql.Date;

public class MessageBean implements Serializable {

	/**
	 * グループID
	 */
	private String groupId;
	
	/**
	 * メッセージの投稿順番号
	 */
	private int sequence;
	
	/**
	 * ユーザID
	 */
	private String userId;
	
	/**
	 * メッセージ･スクリプト
	 */
	private String message;
	
	/**
	 * 投稿日時
	 */
	private Date chatTime;

	/**
	 * グループIDフィールドの値を返します
	 * @return
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * グループIDフィールドに値を設定します
	 * @param groupId
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * メッセージ投稿順番号フィールドの値を返します
	 * @return
	 */
	public int getSequence() {
		return sequence;
	}

	/**
	 * メッセージ投稿順番号フィールドに値を設定します
	 * @param sequence
	 */
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	/**
	 * ユーザIDフィールドフィールドの値を返します
	 * @return
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ユーザIDフィールドに値を設定します
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * メッセージ･スクリプトフィールドフィールドの値を返します
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * メッセージ･スクリプトフィールドに値を設定します
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 投稿日時フィールドフィールドの値を返します
	 * @return
	 */
	public Date getChatTime() {
		return chatTime;
	}

	/**
	 * 投稿日時フィールドに値を設定します
	 * @param chat_time
	 */
	public void setChatTime(Date chatTime) {
		this.chatTime = chatTime;
	}

}
