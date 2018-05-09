package com.example.roufy235.swipeview.Utitlities

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class DbManager {
    val dbName :  String = "rouf"
    val dbVersion : Int = 1
    var context :  Context? = null

    val dbTable = "records"
    val colId = "id"
    val colTitle = "Title"
    val colDes = "Description"
    val createTableSql = "CREATE TABLE $dbTable($colId INTEGER PRIMARY KEY, $colTitle TEXT, $colDes TEXT)"

    val sqldb : SQLiteDatabase
    constructor(context : Context) {
        this.context = context
        val db = myDbHelper(context)
        sqldb = db.writableDatabase

    }

    inner class myDbHelper(context : Context) : SQLiteOpenHelper(context, dbName, null, dbVersion){
        override fun onCreate(db : SQLiteDatabase?) {
            db!!.execSQL(createTableSql)
            Toast.makeText(context, "Database Created", Toast.LENGTH_LONG).show()
        }

        override fun onUpgrade(db : SQLiteDatabase?, oldVersion : Int, newVersion : Int) {
            db!!.execSQL("DROP TABLE IF EXISTS $dbTable")
        }

    }
}