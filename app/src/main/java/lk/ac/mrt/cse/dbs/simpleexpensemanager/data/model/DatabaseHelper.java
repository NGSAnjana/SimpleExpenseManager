package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;


public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "bankAccounts.db";
    public static final String TABLE_NAME =  "accountsTable";

    public static final String COLUMN_1 =  "accountNo";
    public static final String COLUMN_2 =  "bankName";
    public static final String COLUMN_3 =  "accountHolderName";
    public static final String COLUMN_4 =  "balance";

    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
        super(context, DATABASE_NAME, null, 1, null);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL();
        
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        
    }
}
