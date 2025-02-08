package com.example.study2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class CounterFragment : Fragment() {
    private var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textViewCounter = view.findViewById<TextView>(R.id.textViewCounter)
        val buttonIncrement = view.findViewById<Button>(R.id.buttonIncrement)

        textViewCounter.text = counter.toString()

        buttonIncrement.setOnClickListener {
            counter++
            textViewCounter.text = counter.toString()
        }
    }
}
