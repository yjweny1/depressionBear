package com.jiawenYe.depressionbear;

public class LanguageItem {
    private String mLanguageName;
    private int mFlagImage;
    private String mLanno;

    public LanguageItem(String mLanguageName, int mFlagImage, String lanno) {
        this.mLanguageName = mLanguageName;
        this.mFlagImage = mFlagImage;
        this.mLanno = lanno;
    }

    public String getmLanguageName() {
        return mLanguageName;
    }

    public int getmFlagImage() {
        return mFlagImage;
    }

    public String getmLanno() {
        return mLanno;
    }
}
