package com.example.greenspot

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView




class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var adapter: RecordAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        adapter = RecordAdapter()
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        recyclerView.setAdapter(adapter)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_new) {
            val intent = Intent(this, NewRecordActivity::class.java)
            startActivity(intent)
            return true
        } else if (id == R.id.action_help) {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
