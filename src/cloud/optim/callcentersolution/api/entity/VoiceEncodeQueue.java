/**
 * Copyright (C) 2017 OPTiM Corp. All Rights Reserved
 * システム名：
 * ソースファイル名：VoiceEncodeQueue.java
 */

package cloud.optim.callcentersolution.api.entity;
// Generated by Hibernate Tools 3.2.2.CR1


import java.util.Date;

/**

 */
public class VoiceEncodeQueue  implements java.io.Serializable {


	/**
	 * 通話音声圧縮キューID
	 */
	private Long voiceEncodeQueueId;

	/**
	 * 更新日時
	 */
	private Date updateDate;

	/**
	 * 企業 ID
	 */
	private String companyId;

	/**
	 * 通話ログ ID
	 */
	private Long callLogId;

	/**
	 * 通話ログ詳細 ID
	 */
	private Long callLogDetailId;

	/**
	 * 作成日時
	 */
	private Date createDate;

	/**
	 * 作成ユーザ ID
	 */
	private String createUserId;

	/**
	 * 作成ユーザ名
	 */
	private String createUserName;


	/**
	 * VoiceEncodeQueue デフォルトコンストラクター
	 */
	public VoiceEncodeQueue() {
	}

	/**
	 * VoiceEncodeQueue フルコンストラクター
	 * @param companyId 企業 ID
	 * @param callLogId 通話ログ ID
	 * @param callLogDetailId 通話ログ詳細 ID
	 * @param createDate 作成日時
	 * @param createUserId 作成ユーザ ID
	 * @param createUserName 作成ユーザ名
	 */
	public VoiceEncodeQueue(String companyId, Long callLogId, Long callLogDetailId, Date createDate, String createUserId, String createUserName) {
		this.companyId = companyId;
		this.callLogId = callLogId;
		this.callLogDetailId = callLogDetailId;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.createUserName = createUserName;
	}

	// * 通話音声圧縮キューID */
	/**
	 * @return voiceEncodeQueueId (通話音声圧縮キューID)
	 */
	public Long getVoiceEncodeQueueId() {
		return this.voiceEncodeQueueId;
	}

	/**
	 * @param voiceEncodeQueueId 通話音声圧縮キューID
	 */
	public void setVoiceEncodeQueueId(Long voiceEncodeQueueId) {
		this.voiceEncodeQueueId = voiceEncodeQueueId;
	}

	// * 更新日時 */
	/**
	 * @return updateDate (更新日時)
	 */
	public Date getUpdateDate() {
		return this.updateDate;
	}

	/**
	 * @param updateDate 更新日時
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	// * 企業 ID */
	/**
	 * @return companyId (企業 ID)
	 */
	public String getCompanyId() {
		return this.companyId;
	}

	/**
	 * @param companyId 企業 ID
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	// * 通話ログ ID */
	/**
	 * @return callLogId (通話ログ ID)
	 */
	public Long getCallLogId() {
		return this.callLogId;
	}

	/**
	 * @param callLogId 通話ログ ID
	 */
	public void setCallLogId(Long callLogId) {
		this.callLogId = callLogId;
	}

	// * 通話ログ詳細 ID */
	/**
	 * @return callLogDetailId (通話ログ詳細 ID)
	 */
	public Long getCallLogDetailId() {
		return this.callLogDetailId;
	}

	/**
	 * @param callLogDetailId 通話ログ詳細 ID
	 */
	public void setCallLogDetailId(Long callLogDetailId) {
		this.callLogDetailId = callLogDetailId;
	}

	// * 作成日時 */
	/**
	 * @return createDate (作成日時)
	 */
	public Date getCreateDate() {
		return this.createDate;
	}

	/**
	 * @param createDate 作成日時
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	// * 作成ユーザ ID */
	/**
	 * @return createUserId (作成ユーザ ID)
	 */
	public String getCreateUserId() {
		return this.createUserId;
	}

	/**
	 * @param createUserId 作成ユーザ ID
	 */
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	// * 作成ユーザ名 */
	/**
	 * @return createUserName (作成ユーザ名)
	 */
	public String getCreateUserName() {
		return this.createUserName;
	}

	/**
	 * @param createUserName 作成ユーザ名
	 */
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}


	/**
	 * toString
	 * @return String
	*/
	public String toString() {
		StringBuffer buffer = new StringBuffer();

		buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
		buffer.append("voiceEncodeQueueId").append("='").append(getVoiceEncodeQueueId()).append("' ");
		buffer.append("updateDate").append("='").append(getUpdateDate()).append("' ");
		buffer.append("companyId").append("='").append(getCompanyId()).append("' ");
		buffer.append("callLogId").append("='").append(getCallLogId()).append("' ");
		buffer.append("callLogDetailId").append("='").append(getCallLogDetailId()).append("' ");
		buffer.append("createDate").append("='").append(getCreateDate()).append("' ");
		buffer.append("createUserId").append("='").append(getCreateUserId()).append("' ");
		buffer.append("]");

		return buffer.toString();
	}

	@Override
	public boolean equals(Object other) {
		if ( (this == other ) ) return true;
		if ( (other == null ) ) return false;
		if ( !(other instanceof VoiceEncodeQueue) ) return false;
		VoiceEncodeQueue castOther = ( VoiceEncodeQueue ) other;

		return ( (this.getVoiceEncodeQueueId()==castOther.getVoiceEncodeQueueId()) || ( this.getVoiceEncodeQueueId()!=null && castOther.getVoiceEncodeQueueId()!=null && this.getVoiceEncodeQueueId().equals(castOther.getVoiceEncodeQueueId()) ) )
 && ( (this.getUpdateDate()==castOther.getUpdateDate()) || ( this.getUpdateDate()!=null && castOther.getUpdateDate()!=null && this.getUpdateDate().equals(castOther.getUpdateDate()) ) )
 && ( (this.getCompanyId()==castOther.getCompanyId()) || ( this.getCompanyId()!=null && castOther.getCompanyId()!=null && this.getCompanyId().equals(castOther.getCompanyId()) ) )
 && ( (this.getCallLogId()==castOther.getCallLogId()) || ( this.getCallLogId()!=null && castOther.getCallLogId()!=null && this.getCallLogId().equals(castOther.getCallLogId()) ) )
 && ( (this.getCallLogDetailId()==castOther.getCallLogDetailId()) || ( this.getCallLogDetailId()!=null && castOther.getCallLogDetailId()!=null && this.getCallLogDetailId().equals(castOther.getCallLogDetailId()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) )
 && ( (this.getCreateUserId()==castOther.getCreateUserId()) || ( this.getCreateUserId()!=null && castOther.getCreateUserId()!=null && this.getCreateUserId().equals(castOther.getCreateUserId()) ) )
 && ( (this.getCreateUserName()==castOther.getCreateUserName()) || ( this.getCreateUserName()!=null && castOther.getCreateUserName()!=null && this.getCreateUserName().equals(castOther.getCreateUserName()) ) );
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + ( getVoiceEncodeQueueId() == null ? 0 : this.getVoiceEncodeQueueId().hashCode() );
		result = 37 * result + ( getUpdateDate() == null ? 0 : this.getUpdateDate().hashCode() );
		result = 37 * result + ( getCompanyId() == null ? 0 : this.getCompanyId().hashCode() );
		result = 37 * result + ( getCallLogId() == null ? 0 : this.getCallLogId().hashCode() );
		result = 37 * result + ( getCallLogDetailId() == null ? 0 : this.getCallLogDetailId().hashCode() );
		result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
		result = 37 * result + ( getCreateUserId() == null ? 0 : this.getCreateUserId().hashCode() );
		result = 37 * result + ( getCreateUserName() == null ? 0 : this.getCreateUserName().hashCode() );
		return result;
	}

  // The following is extra code specified in the hbm.xml files

	/** serialVersionUID  */
	private static final long serialVersionUID = 1L;
		
  // end of extra code specified in the hbm.xml files

}

