package com.rashidsaleem.notesapp.feature.addEditNote.domain.useCase

import com.rashidsaleem.notesapp.core.domain.model.Note
import com.rashidsaleem.notesapp.core.domain.model.dummyNotes
import com.rashidsaleem.notesapp.core.domain.repository.NotesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GetNoteDetailUseCase(
    private val notesRepository: NotesRepository,
) {

    suspend fun execute(noteId: Int): Note? {
        return withContext(Dispatchers.IO) {

            if (noteId == -1) return@withContext null

//            dummyNotes().firstOrNull { it.id == noteId }
            notesRepository.get(noteId)
        }
    }

}