package com.example.heng.jredu.entity;

import java.io.Serializable;

/**
 * Created by heng on 2015/11/17.
 */


//视频管理
public class Vedio implements Serializable{
    private Long id;
    private String vedioid;
    private String vedioName;
    private String VUri;
    private String projId;
    private String instruction;
    private String author;
    private String pubDate;
    private String VPickUri;
    private String flag;

    public Vedio() {
    }

    public Vedio(Long id, String vedioid, String vedioName, String VUri, String projId
            , String instruction, String author, String pubDate, String VPickUri, String flag) {
        this.id = id;
        this.vedioid = vedioid;
        this.vedioName = vedioName;
        this.VUri = VUri;
        this.projId = projId;
        this.instruction = instruction;
        this.author = author;
        this.pubDate = pubDate;
        this.VPickUri = VPickUri;
        this.flag = flag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVedioid() {
        return vedioid;
    }

    public void setVedioid(String vedioid) {
        this.vedioid = vedioid;
    }

    public String getVedioName() {
        return vedioName;
    }

    public void setVedioName(String vedioName) {
        this.vedioName = vedioName;
    }

    public String getVUri() {
        return VUri;
    }

    public void setVUri(String VUri) {
        this.VUri = VUri;
    }

    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getVPickUri() {
        return VPickUri;
    }

    public void setVPickUri(String VPickUri) {
        this.VPickUri = VPickUri;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
