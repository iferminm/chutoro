package com.jiahaoliuliu.chutoro.storagelayer.destination;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public abstract class DestinationGroupDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public abstract long insert(PersistentDestinationGroup persistentDestinationGroup);

    public synchronized boolean insertIfDoesNotExist(PersistentDestinationGroup persistentDestinationGroup) {
        PersistentDestinationGroup existingPersistentDestinationGroup =
                getDestinationGroupById(persistentDestinationGroup.getId());
        if (existingPersistentDestinationGroup == null) {
            return insert(persistentDestinationGroup) > 0;
        }

        return true;
    }

    @Query("Select * from DestinationGroups where id == :id")
    public abstract PersistentDestinationGroup getDestinationGroupById(long id);

    @Update(onConflict = OnConflictStrategy.IGNORE)
    public abstract void update(PersistentDestinationGroup persistentDestinationGroup);

    @Delete
    public abstract void delete(PersistentDestinationGroup persistentDestinationGroup);
}
