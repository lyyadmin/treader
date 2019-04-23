package com.support.treader.util;

import java.util.Map;
import java.util.Set;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedPreferencesUtils {
	
	private static final String SHARE_NAME = "com.markway.sharedpreferences";

	public static SharedPreferences getSharedPreferences(Context context){
		return context.getSharedPreferences(SHARE_NAME, Context.MODE_PRIVATE);
	}
	
	public static boolean putString(Context context, String key, String value){
		 Editor editor=getSharedPreferences(context).edit();  
	     editor.putString(key, value);  
	     return editor.commit();
	}
	
	public static boolean putBoolean(Context context, String key, boolean value){
		 Editor editor=getSharedPreferences(context).edit();  
	     editor.putBoolean(key, value);
	     return editor.commit();
	}
	
	public static boolean putFloat(Context context, String key, float value){
		 Editor editor=getSharedPreferences(context).edit();  
	     editor.putFloat(key, value);
	     return editor.commit();
	}
	
	public static boolean putInt(Context context, String key, int value){
		 Editor editor=getSharedPreferences(context).edit();  
	     editor.putInt(key, value);
	     return editor.commit();
	}
	
	public static boolean putLong(Context context, String key, long value){
		 Editor editor=getSharedPreferences(context).edit();  
	     editor.putLong(key, value);
	     return editor.commit();
	}
	
	public static boolean putStringSet(Context context, String key, Set<String> value){
		 Editor editor=getSharedPreferences(context).edit();  
	     editor.putStringSet(key, value);
	     return editor.commit();
	}
	
	public static String getString(Context context, String key, String defaultString){
		return getSharedPreferences(context).getString(key, defaultString);
	}
	
	public static boolean getBoolean(Context context, String key, boolean defaultString){
		return getSharedPreferences(context).getBoolean(key, defaultString);
	}
	
	public static int getInt(Context context, String key, int defaultString){
		return getSharedPreferences(context).getInt(key, defaultString);
	}
	
	public static float getFloat(Context context, String key, float defaultString){
		return getSharedPreferences(context).getFloat(key, defaultString);
	}
	
	public static long getLong(Context context, String key, long defaultString){
		return getSharedPreferences(context).getLong(key, defaultString);
	}
	
	public static Set<String> getStringSet(Context context, String key, Set<String> defaultValue){
		return getSharedPreferences(context).getStringSet(key, defaultValue);
	}
	
	public static Map<String,?> getAll(Context context){
		return getSharedPreferences(context).getAll();
	}
	
	public static boolean contains(Context context, String key){
		return getSharedPreferences(context).contains(key);
	}
}
