package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloandroid.R
import com.example.helloandroid.ui.theme.HelloAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    AndroidBasicApp()
                }
            }
        }
    }
}

@Composable
fun AndroidBasicApp() {
    Surface(
        color = Color(red = 7, green = 30, blue = 42)
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            IconAndName(modifier = Modifier.weight(0.8f))
            InformationList(Modifier.weight(0.2f))
        }
    }
}

@Composable
fun IconAndName(modifier: Modifier){
    val image = painterResource(R.drawable.android_logo);
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier,
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.size(100.dp)
        )
        Text(
            text = stringResource(R.string.full_name),
            fontSize = 36.sp,
            color = Color.White,
        )
        Text(
            text = stringResource(R.string.title),
            color = Color(0xFF3ddc84)
        )
    }
}

@Composable
fun InformationList(modifier: Modifier){
    Column(modifier = modifier) {
        ItemInfor(stringResource(R.string.sodienthoai),Icons.Filled.Call)
        ItemInfor("@monleak",Icons.Filled.Share)
        ItemInfor(stringResource(R.string.email),Icons.Filled.Email)
    }
}

@Composable
fun ItemInfor(
    content: String,
    icon: ImageVector
){
    Divider(color = Color(red = 79, green = 108, blue = 121), thickness = 1.dp)
    Row(
        Modifier.fillMaxWidth()
            .padding(top = 5.dp, bottom = 5.dp)
    ) {
        Spacer(Modifier.width(80.dp))
        Icon(
            icon,
            contentDescription = null,
            tint = Color(0xFF3ddc84)
        )
        Spacer(Modifier.width(10.dp))
        Text(
            text = content,
            color = Color.White,
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AndroidBasicAppPreview() {
    HelloAndroidTheme {
        AndroidBasicApp()
    }
}
