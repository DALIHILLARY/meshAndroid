package ug.hix.hixnet2.database

import androidx.lifecycle.LiveData
import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface FileDao {
    @Query("SELECT * FROM file")
    fun getAllFiles() : LiveData<List<File>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg : File)

    @Delete
    fun delete(file : File)

    @Query("SELECT CID FROM file")
    fun gelAllCID() : List<String>

    @Query("SELECT * FROM file")
    fun getFiles() : List<File>

    @Query("SELECT * FROM file WHERE CID LIKE :cid")
    fun getFileByCid(cid: String) : File

    //some advanced queries for bo9th name, file, cloudfile, and cloudfilename tables
    @Query("SELECT * FROM name WHERE name_slub LIKE :slub")
    fun getName(slub: String) : Name?

    @Insert(onConflict = OnConflictStrategy.REPLACE, entity = Name::class)
    fun addName(name: Name)

    @Insert(onConflict = OnConflictStrategy.REPLACE, entity = FileName::class)
    fun addFileName(relation: FileName)

    @Delete(entity = FileSeeder::class)
    fun deleteFileSeeder(relation: FileSeeder)

    @Insert(onConflict = OnConflictStrategy.REPLACE, entity = FileSeeder::class )
    fun addFileSeeder(relation: FileSeeder)

    @Query("SELECT * FROM File ORDER BY mesh_modified DESC LIMIT 1")
    fun getNewCloudFile(): Flow<File>

}