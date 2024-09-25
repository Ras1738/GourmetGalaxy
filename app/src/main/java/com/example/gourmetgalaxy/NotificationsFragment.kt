package com.example.gourmetgalaxy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class NotificationsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_notifications, container, false)

        val notificationsButton: View = view.findViewById(R.id.TurnOnNotificationsBtn)
        notificationsButton.setOnClickListener {

            findNavController().navigate(R.id.action_notificationsFragment_to_settingsnotificationsFragment)
        }

        return view
    }
}