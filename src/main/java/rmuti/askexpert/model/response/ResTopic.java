package rmuti.askexpert.model.response;

import lombok.Data;

@Data
public class ResTopic  {

    private ResTopicUserInfo userInfoData;

    private byte likeStatus;
    //topic
    private String topicId;

    private String topicHeadline;

    private String topicCaption;

    private String topicOwnerId;

    private long topicLikeCount;

    private long topicCommentCount;

    private long topicReadCount;

    private long topicDonateCount;

    private String topicGroup;

    private int topicReportStatus;
}
