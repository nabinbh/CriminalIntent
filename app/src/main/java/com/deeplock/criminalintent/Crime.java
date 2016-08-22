package com.deeplock.criminalintent;

import java.util.UUID;

/**
 * Created by nabinbhattarai on 8/21/16.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getmId() {

        return mId;
    }
}
