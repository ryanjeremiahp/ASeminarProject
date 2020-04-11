package com.example.bud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "budget.db";
    public static final String TABLE_NAME = "transactions.db";
    public static final String COL_1 = "LineItemID";
    public static final String COL_2 = "Account";
    public static final String COL_3 = "Date";
    public static final String COL_4 = "Total";
    public static final String COL_5 = "Category";
    public static final String COL_6 = "Place";
    public static final String COL_7 = "Notes";
    public static final String COL_8 = "Subcategory";



    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME + "" +
                " (LineItemID int primary key autoincrement, Account text, Date date, Total double, Category text, Place text, Notes text, Subcategory text) ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
       sqLiteDatabase.execSQL("drop table if exists " + TABLE_NAME);
       onCreate(sqLiteDatabase);

    }
}
