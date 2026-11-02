
package com.example.scrollablelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val pictures = listOf(
            Picture(R.drawable.image1, "Picture 1"),
            Picture(R.drawable.image2, "Picture 2"),
            Picture(R.drawable.image3, "Picture 3"),
            Picture(R.drawable.image4, "Picture 4"),
            Picture(R.drawable.image5, "Picture 5"),
            Picture(R.drawable.image6, "Picture 6"),
            Picture(R.drawable.image7, "Picture 7"),
            Picture(R.drawable.image8, "Picture 8"),
            Picture(R.drawable.image9, "Picture 9"),
            Picture(R.drawable.image10, "Picture 10"),
            Picture(R.drawable.image11, "Picture 11"),
            Picture(R.drawable.image12, "Picture 12"),
            Picture(R.drawable.image13, "Picture 13"),
            Picture(R.drawable.image14, "Picture 14"),
            Picture(R.drawable.image15, "Picture 15"),
            Picture(R.drawable.image16, "Picture 16")
        )

        setContent {
            MaterialTheme {
                Column(modifier = Modifier.fillMaxSize()) {

                    Text(
                        text = "Scrollable List",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp)
                    )

                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(pictures) { picture ->

                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(4.dp)
                            ) {
                                Column {
                                    Image(
                                        painter = painterResource(picture.image),
                                        contentDescription = picture.description,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(130.dp),
                                        contentScale = ContentScale.Crop
                                    )

                                    Text(
                                        text = picture.description,
                                        fontSize = 16.sp,
                                        modifier = Modifier.padding(8.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
