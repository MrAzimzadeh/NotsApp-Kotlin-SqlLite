package com.example.notsapp.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.util.jar.Attributes.Name

@Entity(tableName = "notes")
data class Not(
    @ColumnInfo(name = "Id") @NotNull
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name = "Nots") @NotNull
    var nots: String,

)