package com.example.tasklaunchpad

import android.app.ProgressDialog
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.tasklaunchpad.databinding.ActivityApiBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ApiActivity : AppCompatActivity() {

    lateinit var binding: ActivityApiBinding  // ?????
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApiBinding.inflate(layoutInflater) //??
        setContentView(binding.root)
        //setContentView(R.layout.activity_api)

        getData()

       // val memeView: ImageView = findViewById(R.id.memeImageView)
        //val memeButton: Button = findViewById(R.id.MemeButton)

        binding.MemeButton.setOnClickListener {
            getData()
        }


    }

    private fun getData() {

        val progressDialog = ProgressDialog(this)
        progressDialog.setMessage("Please wait, while data is being fetch")
        progressDialog.show()

        RetrofitInstance.apiInterface.getData().enqueue(object : Callback<responceDataClass?> {
            override fun onResponse(
                call: Call<responceDataClass?>,
                response: Response<responceDataClass?>
            ) {
                // Handle response here
                //binding.memeAuthor.text = response.body()?.author

                val randomIndex = (0 until response.body()?.data?.memes?.size!!).random()
                //binding.memeTitle.text = response.body()?.data?.memes?.get(randomIndex)?.name

                val randomMeme = response.body()?.data?.memes?.get(randomIndex)
                Log.d("Meme Name", randomMeme?.name ?: "Name is null")
                binding.memeTitle.text = randomMeme?.name ?: "No Name Available"


                Log.d("API Response", response.body().toString())


                Glide.with(this@ApiActivity).load(response.body()?.data?.memes?.get(randomIndex)?.url).into(binding.memeImageView)
                progressDialog.dismiss()


            }

            override fun onFailure(call: Call<responceDataClass?>, t: Throwable) {
                Toast.makeText(this@ApiActivity, "${t.localizedMessage}", Toast.LENGTH_SHORT)
                    .show()
                progressDialog.dismiss()
            }

        })
    }}

