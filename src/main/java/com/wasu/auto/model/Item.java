package com.wasu.auto.model;

import java.util.Date;

public class Item {
    private Long id;

    private String chId;

    private Integer chNo;

    private String chName;

    private String regionId;

    private String assetid;

    private String folder;

    private Integer isPlayback;

    private Integer isBoardcast;

    private Integer ishdch;

    private Integer type;

    private Integer chtype;

    private String playurl;

    private String chlogourl;

    private String chlogoName;

    private String desc;

    private String hdchid;

    private String freq;

    private String mod;

    private String rate;

    private String sid;

    private String casid;

    private String capid;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChId() {
        return chId;
    }

    public void setChId(String chId) {
        this.chId = chId == null ? null : chId.trim();
    }

    public Integer getChNo() {
        return chNo;
    }

    public void setChNo(Integer chNo) {
        this.chNo = chNo;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName == null ? null : chName.trim();
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId == null ? null : regionId.trim();
    }

    public String getAssetid() {
        return assetid;
    }

    public void setAssetid(String assetid) {
        this.assetid = assetid == null ? null : assetid.trim();
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder == null ? null : folder.trim();
    }

    public Integer getIsPlayback() {
        return isPlayback;
    }

    public void setIsPlayback(Integer isPlayback) {
        this.isPlayback = isPlayback;
    }

    public Integer getIsBoardcast() {
        return isBoardcast;
    }

    public void setIsBoardcast(Integer isBoardcast) {
        this.isBoardcast = isBoardcast;
    }

    public Integer getIshdch() {
        return ishdch;
    }

    public void setIshdch(Integer ishdch) {
        this.ishdch = ishdch;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getChtype() {
        return chtype;
    }

    public void setChtype(Integer chtype) {
        this.chtype = chtype;
    }

    public String getPlayurl() {
        return playurl;
    }

    public void setPlayurl(String playurl) {
        this.playurl = playurl == null ? null : playurl.trim();
    }

    public String getChlogourl() {
        return chlogourl;
    }

    public void setChlogourl(String chlogourl) {
        this.chlogourl = chlogourl == null ? null : chlogourl.trim();
    }

    public String getChlogoName() {
        return chlogoName;
    }

    public void setChlogoName(String chlogoName) {
        this.chlogoName = chlogoName == null ? null : chlogoName.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getHdchid() {
        return hdchid;
    }

    public void setHdchid(String hdchid) {
        this.hdchid = hdchid == null ? null : hdchid.trim();
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq == null ? null : freq.trim();
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod == null ? null : mod.trim();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getCasid() {
        return casid;
    }

    public void setCasid(String casid) {
        this.casid = casid == null ? null : casid.trim();
    }

    public String getCapid() {
        return capid;
    }

    public void setCapid(String capid) {
        this.capid = capid == null ? null : capid.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}