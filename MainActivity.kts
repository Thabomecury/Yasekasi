import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnClickListener {
    val button4_Id: Int = 1111
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(){
            Toast.makeText(this,"Place your order", Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener(this)
        // add button dynamically
        val button4 = Button(this)
        button4.setText("Next")
        button4.setLayoutParams(ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT))
        button4.setId(button4_Id)
        button4.x = 250f
        button4.y = 500f
        button4.setOnClickListener(this)
        constraintLayout.addView(button4)
    }
    override fun onClick(view: View) {
        //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when (view.id) {
            R.id.button2 ->
                Toast.makeText(this,"Book service clicked", Toast.LENGTH_SHORT).show()//single line code
            button4_Id->{//multiline code
                val myToast = Toast.makeText(this," clicked", Toast.LENGTH_SHORT)
                myToast.show()
            }
        }
    }
    fun clickButton(v: View){
        val mToast = Toast.makeText(applicationContext,"Search clicked", Toast.LENGTH_SHORT)
        mToast.show()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                Toast.makeText(applicationContext, "click on profile", Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_share ->{
                Toast.makeText(applicationContext, "click offers and special", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.action_exit ->{
                Toast.makeText(applicationContext, "click updates", Toast.LENGTH_LONG).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}