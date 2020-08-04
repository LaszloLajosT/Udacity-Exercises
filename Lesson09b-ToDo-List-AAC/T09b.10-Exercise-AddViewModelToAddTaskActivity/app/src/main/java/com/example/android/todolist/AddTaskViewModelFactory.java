package com.example.android.todolist;

import com.example.android.todolist.database.AppDatabase;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

// COMPLETED (1) Make this class extend ViewModel ViewModelProvider.NewInstanceFactory
public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    // COMPLETED (2) Add two member variables. One for the database and one for the taskId
    private final AppDatabase mDb;
    private final int mTaskId;

    public AddTaskViewModelFactory(AppDatabase database, int taskId) {
        mDb = database;
        mTaskId = taskId;
    }

    // COMPLETED (3) Initialize the member variables in the constructor with the parameters received

    // COMPLETED (4) Uncomment the following method
    // Note: This can be reused with minor modifications
    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        //noinspection unchecked
        return (T) new AddTaskViewModel(mDb, mTaskId);
    }
}
