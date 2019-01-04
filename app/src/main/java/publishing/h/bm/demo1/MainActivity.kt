package publishing.h.bm.demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCong.setOnClickListener {
            var a = edtSoA.text.toString()
            var b = edtSoB.text.toString()

            textView.text = cong(a.toInt(), b.toInt()).toString()
        }

        btnTru.setOnClickListener {
            var a = edtSoA.text.toString()
            var b = edtSoB.text.toString()
            textView.text = tru(a.toInt(), b.toInt()).toString()
        }

        btnNhan.setOnClickListener {
            var a = edtSoA.text.toString()
            var b = edtSoB.text.toString()
            textView.text = nhan(a.toInt(), b.toInt()).toString()
        }
        btnChia.setOnClickListener {
            var a = edtSoA.text.toString()
            var b = edtSoB.text.toString()
            textView.text = chia(a.toInt(), b.toInt()).toString()
        }
    }

    private fun cong(a: Int, b: Int): Double {


        return (a + b).toDouble()
    }

    private fun tru(a: Int, b: Int): Double {

        return (a - b).toDouble()
    }

    private fun nhan(a: Int, b: Int): Double {


        return (a * b).toDouble()
    }

    private fun chia(a: Int, b: Int): Double {

        return (a / b).toDouble()
    }
}
