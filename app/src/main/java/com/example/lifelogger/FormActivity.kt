package com.example.lifelogger

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.lifelogger.databinding.ActivityFormBinding


class FormActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFormBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.save_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_save -> {
                val eventData = EventData(
                    binding.name.text.toString(),
                    binding.date.text.toString(),
                    binding.desc.text.toString(),
                )

                val returnIntent = Intent()
                returnIntent.putExtra("eventData", eventData)
                setResult(RESULT_OK, returnIntent)
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}