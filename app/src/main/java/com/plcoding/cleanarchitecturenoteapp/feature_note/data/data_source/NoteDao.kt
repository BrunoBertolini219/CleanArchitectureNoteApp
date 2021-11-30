package com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source

import androidx.room.*
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    fun insetNotes(note: Note)

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Delete
    suspend fun deleteNote(note: Note)


}