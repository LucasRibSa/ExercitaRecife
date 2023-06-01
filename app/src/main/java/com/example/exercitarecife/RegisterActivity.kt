package com.example.exercitarecife
import android.content.Intent
import com.example.exercitarecife.databinding.ActivityRegisterBinding
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private lateinit var dbRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val registerButton = binding.registerButton
        val backToLoginButton = binding.backToLoginButton
        val username = binding.usernameEditText
        val password = binding.passwordEditText
        dbRef = FirebaseDatabase.getInstance().getReference("Registro")

        registerButton.setOnClickListener {
            val usuario = username.text.toString()
            val senha = password.text.toString()
            if (usuario.isEmpty()){
                username.error = "por favor, digite um nome de usuario"
            }
            if (senha.isEmpty()) {
                password.error = "por favor, digite uma senha"
            }
            val reg = dbRef.push().key!!
            val registro = Dados(reg, usuario, senha)

            dbRef.child(reg).setValue(registro)
                .addOnCompleteListener{
                    Toast.makeText(this, "Cadastro realizado", Toast.LENGTH_SHORT).show()

                    username.text?.clear()
                    password.text?.clear()


                }.addOnFailureListener{err ->
                    Toast.makeText(this, "Error ${err.message}", Toast.LENGTH_SHORT).show()
                }
            //val intent = Intent(this, MainActivity::class.java)
            //startActivity(intent)
        }



        backToLoginButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
