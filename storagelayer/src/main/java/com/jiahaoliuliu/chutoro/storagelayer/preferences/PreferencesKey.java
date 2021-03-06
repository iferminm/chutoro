package com.jiahaoliuliu.chutoro.storagelayer.preferences;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.StringDef;

public class PreferencesKey {

    // Long
    public static final String KEY_DATABASE_LAST_UPDATE_TIME = "DATABASE_LAST_UPDATE_TIME";

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({KEY_DATABASE_LAST_UPDATE_TIME})
    public @interface LongKey {}

    // Boolean
    public static final String KEY_ANY_BOOLEAN = "ANY_BOOLEAN";

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({KEY_ANY_BOOLEAN})
    public @interface BooleanKey {}

}
