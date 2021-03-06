package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.usecase

class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
) {
}