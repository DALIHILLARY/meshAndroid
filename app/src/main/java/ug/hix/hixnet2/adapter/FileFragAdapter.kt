package ug.hix.hixnet2.adapter

import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.PopupMenu
import androidx.appcompat.view.menu.MenuBuilder
import androidx.appcompat.view.menu.MenuPopupHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.workDataOf
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import java.io.File as JFile
import ug.hix.hixnet2.R
import ug.hix.hixnet2.database.File
import ug.hix.hixnet2.workers.SendFileWorker

class FileFragAdapter(private val context: Context) : RecyclerView.Adapter<FileFragAdapter.FileFragViewHolder>() {
    private var fileSet = listOf<File>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FileFragViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.file_item, parent,false)

        return FileFragViewHolder(v)
    }

    override fun getItemCount() = fileSet.size

    override fun onBindViewHolder(holder: FileFragViewHolder, position: Int) {
       holder.bind(fileSet[position])
    }

    fun setFiles(files: List<File>){
        this.fileSet = files
        notifyDataSetChanged()

    }

    inner class FileFragViewHolder(fileView: View) : RecyclerView.ViewHolder(fileView) {
        private val fileIcon: ImageView = fileView.findViewById(R.id.fileIcon)
        private var fileName: TextView = fileView.findViewById(R.id.fileName)
        private var fileSize: TextView = fileView.findViewById(R.id.fileSize)
        private val fileModified: TextView   = fileView.findViewById(R.id.fileModifiedDate)
        private val fileOptionsMenu: TextView = fileView.findViewById(R.id.fileOptionsMenu)


        fun bind(file: File){
            fileName.text = file.cloudName
            fileSize.text = file.size.toString()
            fileModified.text = file.modified

            when(file.extension){
                "pdf" -> Glide.with(context).load(R.drawable.pdf).diskCacheStrategy(
                    DiskCacheStrategy.ALL).skipMemoryCache(true).fitCenter().into(fileIcon)
                in listOf("xlsx","xls") -> Glide.with(context).load(R.drawable.excel).diskCacheStrategy(
                    DiskCacheStrategy.ALL).skipMemoryCache(true).fitCenter().into(fileIcon)
                in listOf("doc","docx") -> Glide.with(context).load(R.drawable.word).diskCacheStrategy(
                    DiskCacheStrategy.ALL).skipMemoryCache(true).fitCenter().into(fileIcon)
                in listOf("ppt","pptx") -> Glide.with(context).load(R.drawable.powerpoint).diskCacheStrategy(
                    DiskCacheStrategy.ALL).skipMemoryCache(true).fitCenter().into(fileIcon)
                "txt"  -> Glide.with(context).load(R.drawable.text).diskCacheStrategy(
                    DiskCacheStrategy.ALL).skipMemoryCache(true).fitCenter().into(fileIcon)
                "rar"  -> Glide.with(context).load(R.drawable.rar).diskCacheStrategy(
                    DiskCacheStrategy.ALL).skipMemoryCache(true).fitCenter().into(fileIcon)
                in listOf("zip","tar","tz") -> Glide.with(context).load(R.drawable.zip).diskCacheStrategy(
                    DiskCacheStrategy.ALL).skipMemoryCache(true).fitCenter().into(fileIcon)
                in listOf("mp4","jpg","mkv","3gp") ->  Glide.with(context).load(JFile(file.path)).diskCacheStrategy(
                    DiskCacheStrategy.ALL).skipMemoryCache(true).fitCenter().centerCrop().into(fileIcon)

            }
            fileOptionsMenu.setOnClickListener {
                val popUpMenu = PopupMenu(context,fileOptionsMenu)
                popUpMenu.inflate(R.menu.files_menu)
                popUpMenu.setOnMenuItemClickListener {
                    when(it.itemId){
                        R.id.fileOpen -> {
//                         TODO("Open file in Overlay fragment")
                        }
                        R.id.fileSend -> {
                            val fileCid = file.CID
                            val sendWorker = OneTimeWorkRequestBuilder<SendFileWorker>()
                                .setInputData(workDataOf("fileCID" to fileCid))
                                .build()
                            WorkManager.getInstance(context).enqueue(sendWorker)

                        }
                        R.id.fileInfo -> {
//                            TODO("Open an activity showing info")
                        }
                        R.id.filesDelete -> {
//                            TODO("Delete file from Database)
                        }
                        R.id.filesEdit -> {
//                            TODO("modify name in database")
                        }
                    }
                    false
                }
                val menuHelper = MenuPopupHelper(context, popUpMenu.menu as MenuBuilder, fileOptionsMenu)
                menuHelper.setForceShowIcon(true)
                popUpMenu.show()
            }
        }

    }
}