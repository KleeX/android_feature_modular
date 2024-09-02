package com.test.app

//import com.test.app.Greeting
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.test.app.feature_post_details.PostDetailsScreen
import com.test.app.feature_posts.PostListScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavHost(navController, startDestination = "feature_posts") {

                        composable("feature_posts") {
                            PostListScreen {
                                navController.navigate("feature_post_details/$it")
                            }
                        }
                        composable("feature_post_details/{postId}") { backStackEntry ->
                            val postId =
                                backStackEntry.arguments?.getString("postId")?.toIntOrNull()
                            assert(postId != null)
                            postId?.let { PostDetailsScreen(it) }
                        }
                    }
                }
            }
        }
    }
}