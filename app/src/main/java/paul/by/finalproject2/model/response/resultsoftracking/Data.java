
package paul.by.finalproject2.model.response.resultsoftracking;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("weight.volume")
    @Expose
    private Integer weightVolume;
    @SerializedName("weight.actual")
    @Expose
    private String weightActual;
    @SerializedName("weight.dimensions")
    @Expose
    private String weightDimensions;
    @SerializedName("weight.seats")
    @Expose
    private Integer weightSeats;
    @SerializedName("recipient")
    @Expose
    private String recipient;
    @SerializedName("recipient.title")
    @Expose
    private String recipientTitle;
    @SerializedName("recipient.phone")
    @Expose
    private String recipientPhone;
    @SerializedName("recipient.location")
    @Expose
    private String recipientLocation;
    @SerializedName("recipient.location.title")
    @Expose
    private String recipientLocationTitle;
    @SerializedName("recipient.location.zip_code")
    @Expose
    private String recipientLocationZipCode;
    @SerializedName("recipient.location.phone")
    @Expose
    private String recipientLocationPhone;
    @SerializedName("recipient.location.email")
    @Expose
    private String recipientLocationEmail;
    @SerializedName("sender")
    @Expose
    private String sender;
    @SerializedName("sender.title")
    @Expose
    private String senderTitle;
    @SerializedName("sender.phone")
    @Expose
    private String senderPhone;
    @SerializedName("sender.location")
    @Expose
    private String senderLocation;
    @SerializedName("sender.location.title")
    @Expose
    private String senderLocationTitle;
    @SerializedName("sender.location.zip_code")
    @Expose
    private String senderLocationZipCode;
    @SerializedName("sender.location.phone")
    @Expose
    private String senderLocationPhone;
    @SerializedName("sender.location.email")
    @Expose
    private String senderLocationEmail;
    @SerializedName("delivery")
    @Expose
    private String delivery;
    @SerializedName("delivery.service_name")
    @Expose
    private String deliveryServiceName;
    @SerializedName("delivery.intended_delivery_date")
    @Expose
    private String deliveryIntendedDeliveryDate;
    @SerializedName("specific")
    @Expose
    private String specific;
    @SerializedName("specific.russian-post")
    @Expose
    private String specificRussianPost;
    @SerializedName("specific.russian-post.finance")
    @Expose
    private String specificRussianPostFinance;
    @SerializedName("specific.russian-post.finance.payment")
    @Expose
    private Integer specificRussianPostFinancePayment;
    @SerializedName("specific.russian-post.finance.value")
    @Expose
    private Integer specificRussianPostFinanceValue;
    @SerializedName("specific.russian-post.finance.mass_rate")
    @Expose
    private Integer specificRussianPostFinanceMassRate;
    @SerializedName("specific.russian-post.finance.insr_rate")
    @Expose
    private Integer specificRussianPostFinanceInsrRate;
    @SerializedName("specific.russian-post.finance.air_rate")
    @Expose
    private Integer specificRussianPostFinanceAirRate;
    @SerializedName("specific.russian-post.finance.rate")
    @Expose
    private Integer specificRussianPostFinanceRate;
    @SerializedName("specific.russian-post.item")
    @Expose
    private String specificRussianPostItem;
    @SerializedName("specific.russian-post.item.complex_item_name")
    @Expose
    private String specificRussianPostItemComplexItemName;
    @SerializedName("specific.russian-post.item.mail_rank")
    @Expose
    private String specificRussianPostItemMailRank;
    @SerializedName("specific.russian-post.item.mail_type")
    @Expose
    private String specificRussianPostItemMailType;
    @SerializedName("specific.russian-post.item.post_mark")
    @Expose
    private String specificRussianPostItemPostMark;
    @SerializedName("specific.russian-post.item.mail_category")
    @Expose
    private String specificRussianPostItemMailCategory;

    /**
     * 
     * @return
     *     The weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The weightVolume
     */
    public Integer getWeightVolume() {
        return weightVolume;
    }

    /**
     * 
     * @param weightVolume
     *     The weight.volume
     */
    public void setWeightVolume(Integer weightVolume) {
        this.weightVolume = weightVolume;
    }

    /**
     * 
     * @return
     *     The weightActual
     */
    public String getWeightActual() {
        return weightActual;
    }

    /**
     * 
     * @param weightActual
     *     The weight.actual
     */
    public void setWeightActual(String weightActual) {
        this.weightActual = weightActual;
    }

    /**
     * 
     * @return
     *     The weightDimensions
     */
    public String getWeightDimensions() {
        return weightDimensions;
    }

    /**
     * 
     * @param weightDimensions
     *     The weight.dimensions
     */
    public void setWeightDimensions(String weightDimensions) {
        this.weightDimensions = weightDimensions;
    }

    /**
     * 
     * @return
     *     The weightSeats
     */
    public Integer getWeightSeats() {
        return weightSeats;
    }

    /**
     * 
     * @param weightSeats
     *     The weight.seats
     */
    public void setWeightSeats(Integer weightSeats) {
        this.weightSeats = weightSeats;
    }

    /**
     * 
     * @return
     *     The recipient
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * 
     * @param recipient
     *     The recipient
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     * 
     * @return
     *     The recipientTitle
     */
    public String getRecipientTitle() {
        return recipientTitle;
    }

    /**
     * 
     * @param recipientTitle
     *     The recipient.title
     */
    public void setRecipientTitle(String recipientTitle) {
        this.recipientTitle = recipientTitle;
    }

    /**
     * 
     * @return
     *     The recipientPhone
     */
    public String getRecipientPhone() {
        return recipientPhone;
    }

    /**
     * 
     * @param recipientPhone
     *     The recipient.phone
     */
    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }

    /**
     * 
     * @return
     *     The recipientLocation
     */
    public String getRecipientLocation() {
        return recipientLocation;
    }

    /**
     * 
     * @param recipientLocation
     *     The recipient.location
     */
    public void setRecipientLocation(String recipientLocation) {
        this.recipientLocation = recipientLocation;
    }

    /**
     * 
     * @return
     *     The recipientLocationTitle
     */
    public String getRecipientLocationTitle() {
        return recipientLocationTitle;
    }

    /**
     * 
     * @param recipientLocationTitle
     *     The recipient.location.title
     */
    public void setRecipientLocationTitle(String recipientLocationTitle) {
        this.recipientLocationTitle = recipientLocationTitle;
    }

    /**
     * 
     * @return
     *     The recipientLocationZipCode
     */
    public String getRecipientLocationZipCode() {
        return recipientLocationZipCode;
    }

    /**
     * 
     * @param recipientLocationZipCode
     *     The recipient.location.zip_code
     */
    public void setRecipientLocationZipCode(String recipientLocationZipCode) {
        this.recipientLocationZipCode = recipientLocationZipCode;
    }

    /**
     * 
     * @return
     *     The recipientLocationPhone
     */
    public String getRecipientLocationPhone() {
        return recipientLocationPhone;
    }

    /**
     * 
     * @param recipientLocationPhone
     *     The recipient.location.phone
     */
    public void setRecipientLocationPhone(String recipientLocationPhone) {
        this.recipientLocationPhone = recipientLocationPhone;
    }

    /**
     * 
     * @return
     *     The recipientLocationEmail
     */
    public String getRecipientLocationEmail() {
        return recipientLocationEmail;
    }

    /**
     * 
     * @param recipientLocationEmail
     *     The recipient.location.email
     */
    public void setRecipientLocationEmail(String recipientLocationEmail) {
        this.recipientLocationEmail = recipientLocationEmail;
    }

    /**
     * 
     * @return
     *     The sender
     */
    public String getSender() {
        return sender;
    }

    /**
     * 
     * @param sender
     *     The sender
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * 
     * @return
     *     The senderTitle
     */
    public String getSenderTitle() {
        return senderTitle;
    }

    /**
     * 
     * @param senderTitle
     *     The sender.title
     */
    public void setSenderTitle(String senderTitle) {
        this.senderTitle = senderTitle;
    }

    /**
     * 
     * @return
     *     The senderPhone
     */
    public String getSenderPhone() {
        return senderPhone;
    }

    /**
     * 
     * @param senderPhone
     *     The sender.phone
     */
    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    /**
     * 
     * @return
     *     The senderLocation
     */
    public String getSenderLocation() {
        return senderLocation;
    }

    /**
     * 
     * @param senderLocation
     *     The sender.location
     */
    public void setSenderLocation(String senderLocation) {
        this.senderLocation = senderLocation;
    }

    /**
     * 
     * @return
     *     The senderLocationTitle
     */
    public String getSenderLocationTitle() {
        return senderLocationTitle;
    }

    /**
     * 
     * @param senderLocationTitle
     *     The sender.location.title
     */
    public void setSenderLocationTitle(String senderLocationTitle) {
        this.senderLocationTitle = senderLocationTitle;
    }

    /**
     * 
     * @return
     *     The senderLocationZipCode
     */
    public String getSenderLocationZipCode() {
        return senderLocationZipCode;
    }

    /**
     * 
     * @param senderLocationZipCode
     *     The sender.location.zip_code
     */
    public void setSenderLocationZipCode(String senderLocationZipCode) {
        this.senderLocationZipCode = senderLocationZipCode;
    }

    /**
     * 
     * @return
     *     The senderLocationPhone
     */
    public String getSenderLocationPhone() {
        return senderLocationPhone;
    }

    /**
     * 
     * @param senderLocationPhone
     *     The sender.location.phone
     */
    public void setSenderLocationPhone(String senderLocationPhone) {
        this.senderLocationPhone = senderLocationPhone;
    }

    /**
     * 
     * @return
     *     The senderLocationEmail
     */
    public String getSenderLocationEmail() {
        return senderLocationEmail;
    }

    /**
     * 
     * @param senderLocationEmail
     *     The sender.location.email
     */
    public void setSenderLocationEmail(String senderLocationEmail) {
        this.senderLocationEmail = senderLocationEmail;
    }

    /**
     * 
     * @return
     *     The delivery
     */
    public String getDelivery() {
        return delivery;
    }

    /**
     * 
     * @param delivery
     *     The delivery
     */
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    /**
     * 
     * @return
     *     The deliveryServiceName
     */
    public String getDeliveryServiceName() {
        return deliveryServiceName;
    }

    /**
     * 
     * @param deliveryServiceName
     *     The delivery.service_name
     */
    public void setDeliveryServiceName(String deliveryServiceName) {
        this.deliveryServiceName = deliveryServiceName;
    }

    /**
     * 
     * @return
     *     The deliveryIntendedDeliveryDate
     */
    public String getDeliveryIntendedDeliveryDate() {
        return deliveryIntendedDeliveryDate;
    }

    /**
     * 
     * @param deliveryIntendedDeliveryDate
     *     The delivery.intended_delivery_date
     */
    public void setDeliveryIntendedDeliveryDate(String deliveryIntendedDeliveryDate) {
        this.deliveryIntendedDeliveryDate = deliveryIntendedDeliveryDate;
    }

    /**
     * 
     * @return
     *     The specific
     */
    public String getSpecific() {
        return specific;
    }

    /**
     * 
     * @param specific
     *     The specific
     */
    public void setSpecific(String specific) {
        this.specific = specific;
    }

    /**
     * 
     * @return
     *     The specificRussianPost
     */
    public String getSpecificRussianPost() {
        return specificRussianPost;
    }

    /**
     * 
     * @param specificRussianPost
     *     The specific.russian-post
     */
    public void setSpecificRussianPost(String specificRussianPost) {
        this.specificRussianPost = specificRussianPost;
    }

    /**
     * 
     * @return
     *     The specificRussianPostFinance
     */
    public String getSpecificRussianPostFinance() {
        return specificRussianPostFinance;
    }

    /**
     * 
     * @param specificRussianPostFinance
     *     The specific.russian-post.finance
     */
    public void setSpecificRussianPostFinance(String specificRussianPostFinance) {
        this.specificRussianPostFinance = specificRussianPostFinance;
    }

    /**
     * 
     * @return
     *     The specificRussianPostFinancePayment
     */
    public Integer getSpecificRussianPostFinancePayment() {
        return specificRussianPostFinancePayment;
    }

    /**
     * 
     * @param specificRussianPostFinancePayment
     *     The specific.russian-post.finance.payment
     */
    public void setSpecificRussianPostFinancePayment(Integer specificRussianPostFinancePayment) {
        this.specificRussianPostFinancePayment = specificRussianPostFinancePayment;
    }

    /**
     * 
     * @return
     *     The specificRussianPostFinanceValue
     */
    public Integer getSpecificRussianPostFinanceValue() {
        return specificRussianPostFinanceValue;
    }

    /**
     * 
     * @param specificRussianPostFinanceValue
     *     The specific.russian-post.finance.value
     */
    public void setSpecificRussianPostFinanceValue(Integer specificRussianPostFinanceValue) {
        this.specificRussianPostFinanceValue = specificRussianPostFinanceValue;
    }

    /**
     * 
     * @return
     *     The specificRussianPostFinanceMassRate
     */
    public Integer getSpecificRussianPostFinanceMassRate() {
        return specificRussianPostFinanceMassRate;
    }

    /**
     * 
     * @param specificRussianPostFinanceMassRate
     *     The specific.russian-post.finance.mass_rate
     */
    public void setSpecificRussianPostFinanceMassRate(Integer specificRussianPostFinanceMassRate) {
        this.specificRussianPostFinanceMassRate = specificRussianPostFinanceMassRate;
    }

    /**
     * 
     * @return
     *     The specificRussianPostFinanceInsrRate
     */
    public Integer getSpecificRussianPostFinanceInsrRate() {
        return specificRussianPostFinanceInsrRate;
    }

    /**
     * 
     * @param specificRussianPostFinanceInsrRate
     *     The specific.russian-post.finance.insr_rate
     */
    public void setSpecificRussianPostFinanceInsrRate(Integer specificRussianPostFinanceInsrRate) {
        this.specificRussianPostFinanceInsrRate = specificRussianPostFinanceInsrRate;
    }

    /**
     * 
     * @return
     *     The specificRussianPostFinanceAirRate
     */
    public Integer getSpecificRussianPostFinanceAirRate() {
        return specificRussianPostFinanceAirRate;
    }

    /**
     * 
     * @param specificRussianPostFinanceAirRate
     *     The specific.russian-post.finance.air_rate
     */
    public void setSpecificRussianPostFinanceAirRate(Integer specificRussianPostFinanceAirRate) {
        this.specificRussianPostFinanceAirRate = specificRussianPostFinanceAirRate;
    }

    /**
     * 
     * @return
     *     The specificRussianPostFinanceRate
     */
    public Integer getSpecificRussianPostFinanceRate() {
        return specificRussianPostFinanceRate;
    }

    /**
     * 
     * @param specificRussianPostFinanceRate
     *     The specific.russian-post.finance.rate
     */
    public void setSpecificRussianPostFinanceRate(Integer specificRussianPostFinanceRate) {
        this.specificRussianPostFinanceRate = specificRussianPostFinanceRate;
    }

    /**
     * 
     * @return
     *     The specificRussianPostItem
     */
    public String getSpecificRussianPostItem() {
        return specificRussianPostItem;
    }

    /**
     * 
     * @param specificRussianPostItem
     *     The specific.russian-post.item
     */
    public void setSpecificRussianPostItem(String specificRussianPostItem) {
        this.specificRussianPostItem = specificRussianPostItem;
    }

    /**
     * 
     * @return
     *     The specificRussianPostItemComplexItemName
     */
    public String getSpecificRussianPostItemComplexItemName() {
        return specificRussianPostItemComplexItemName;
    }

    /**
     * 
     * @param specificRussianPostItemComplexItemName
     *     The specific.russian-post.item.complex_item_name
     */
    public void setSpecificRussianPostItemComplexItemName(String specificRussianPostItemComplexItemName) {
        this.specificRussianPostItemComplexItemName = specificRussianPostItemComplexItemName;
    }

    /**
     * 
     * @return
     *     The specificRussianPostItemMailRank
     */
    public String getSpecificRussianPostItemMailRank() {
        return specificRussianPostItemMailRank;
    }

    /**
     * 
     * @param specificRussianPostItemMailRank
     *     The specific.russian-post.item.mail_rank
     */
    public void setSpecificRussianPostItemMailRank(String specificRussianPostItemMailRank) {
        this.specificRussianPostItemMailRank = specificRussianPostItemMailRank;
    }

    /**
     * 
     * @return
     *     The specificRussianPostItemMailType
     */
    public String getSpecificRussianPostItemMailType() {
        return specificRussianPostItemMailType;
    }

    /**
     * 
     * @param specificRussianPostItemMailType
     *     The specific.russian-post.item.mail_type
     */
    public void setSpecificRussianPostItemMailType(String specificRussianPostItemMailType) {
        this.specificRussianPostItemMailType = specificRussianPostItemMailType;
    }

    /**
     * 
     * @return
     *     The specificRussianPostItemPostMark
     */
    public String getSpecificRussianPostItemPostMark() {
        return specificRussianPostItemPostMark;
    }

    /**
     * 
     * @param specificRussianPostItemPostMark
     *     The specific.russian-post.item.post_mark
     */
    public void setSpecificRussianPostItemPostMark(String specificRussianPostItemPostMark) {
        this.specificRussianPostItemPostMark = specificRussianPostItemPostMark;
    }

    /**
     * 
     * @return
     *     The specificRussianPostItemMailCategory
     */
    public String getSpecificRussianPostItemMailCategory() {
        return specificRussianPostItemMailCategory;
    }

    /**
     * 
     * @param specificRussianPostItemMailCategory
     *     The specific.russian-post.item.mail_category
     */
    public void setSpecificRussianPostItemMailCategory(String specificRussianPostItemMailCategory) {
        this.specificRussianPostItemMailCategory = specificRussianPostItemMailCategory;
    }

}
