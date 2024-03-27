
import android.content.Context
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cscorner.businesscardapp.R

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeveloperCard(context = this)
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun DeveloperCard(context: Context) {
    Surface(
        color = Color.White,
        border = BorderStroke(1.dp, Color.Black), // Border
        shape = RoundedCornerShape(8.dp), // Rounded corners
        modifier = Modifier.padding(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.dfkjhdsj),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .size(200.dp)
                    .padding(bottom = 0.1.dp) // Add negative margin to move the picture upwards
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Om Shankar Thakur",
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                ),
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = "Software Engineer",
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 18.sp,
                    color = Color.Black
                ),
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(10.dp))

            ContactInfo(" omshankar466@gmail.com")
            ContactInfo("github.com/Om-Shankar-Thakur")
            ContactInfo("linkedin.com/in/om-shankar-86981b224/")
        }
    }
}

@Composable
fun ContactInfo(text: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = text,
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 15.sp,
                color = Color.Black
            ),
            color = Color.Blue
        )
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun PreviewDeveloperCard() {
    DeveloperCard(context = androidx.compose.ui.platform.LocalContext.current)
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
fun DefaultPreview() {
    PreviewDeveloperCard()
}
