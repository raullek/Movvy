//package com.example.movvy.presentation.ui.detail
//
//import android.os.Bundle
//import android.util.Log
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.FrameLayout
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.DisposableEffect
//import androidx.compose.runtime.collectAsState
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.platform.ComposeView
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.platform.testTag
//import androidx.compose.ui.viewinterop.AndroidView
//import androidx.constraintlayout.compose.ConstraintLayout
//import androidx.fragment.app.Fragment
//import androidx.fragment.app.viewModels
//import com.example.core_utill.viewmodel.Factory
//import com.example.movvy.data.model.MovieVideo
//import com.example.movvy.data.model.ResultX
//import com.example.movvy.di.module.ApplicationComponent
//import com.example.movvy.utills.Result
//import com.example.movvy.utills.Status
//import com.google.android.exoplayer2.MediaItem
//import com.google.android.youtube.player.YouTubeInitializationResult
//import com.google.android.youtube.player.YouTubePlayer
//import com.google.android.youtube.player.YouTubePlayerView
//
//
//const val YOUTUBE_KEY = "AIzaSyBjNgtWrq2GTPf7ueAjpovDjeOrnI2Rjc8"
//
//
//class DetailFragment : Fragment() {
//    private val detailFragmentViewModel: DetailFragmentViewModel by viewModels {
//        Factory {
//            ApplicationComponent.get().mainScreenComponent().getDetailViewModel()
//        }
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        return ComposeView(requireContext()).apply {
//            setContent {
//                val movieId = arguments?.getInt("movie_id", 0)
//                DetailScreen(
//                    modifier = Modifier,
//                    detailFragmentViewModel = detailFragmentViewModel.also {
//                        it.getMovieById(
//                            movieId!!
//                        )
//                    })
//            }
//
//        }
//    }
//
//    @Composable
//    fun DetailScreen(
//        modifier: Modifier = Modifier,
//        detailFragmentViewModel: DetailFragmentViewModel
//    ) {
//      val movieVideos = detailFragmentViewModel.movieVideos.collectAsState()
//       when(movieVideos.value){
//           is Result.Success -> VideoPlayerScreen(modifier = modifier, movie = (movieVideos.value as Result.Success<MovieVideo>).data.results.first().key)
//           is Result.Loading ->LoadingScreen()
//           is Result.Error -> ErrorScreen()
//        }
//    }
//
//
//}
//
//@Composable
//fun LoadingScreen() {
//
//}
//
//@Composable
//fun ErrorScreen() {
//
//}
//
//@Composable
//fun VideoPlayerScreen(modifier: Modifier = Modifier, movie: String?) {
//    val context = LocalContext.current
//    val mediaItem = MediaItem.Builder()
//
//    val youtubePlayer = remember {
//      YouTubePlayerView(context).also { it.initialize(YOUTUBE_KEY,object :YouTubePlayer.OnInitializedListener{
//          override fun onInitializationSuccess(
//              p0: YouTubePlayer.Provider?,
//              youtubePlayer: YouTubePlayer?,
//              wasRestored: Boolean
//          ) {
//              Log.d("","")
//
//              if (!wasRestored) {
//                  youtubePlayer?.cueVideo(movie)
//              }
//          }
//
//          override fun onInitializationFailure(
//              p0: YouTubePlayer.Provider?,
//              p1: YouTubeInitializationResult?
//          ) {
//              Log.d("","")
//
//          }
//
//      }) }
//    }
//
//    ConstraintLayout() {
//        val (videoPlayer, videoPlaylist) = createRefs()
//        DisposableEffect(
//            AndroidView(
//                modifier =
//                Modifier
//                    .testTag("VideoPlayer")
//                    .constrainAs(videoPlayer) {
//                        top.linkTo(parent.top)
//                        start.linkTo(parent.start)
//                        end.linkTo(parent.end)
//                        bottom.linkTo(parent.bottom)
//                    },
//                factory = {
//                    // exo player view for our video player
//                    youtubePlayer.apply {
//                        layoutParams =
//                            FrameLayout.LayoutParams(
//                                ViewGroup.LayoutParams
//                                    .MATCH_PARENT,
//                                ViewGroup.LayoutParams
//                                    .MATCH_PARENT
//                            )
//                    }
//                }
//            )
//        ) {
//            onDispose {
//                youtubePlayer
//            }
//
//        }
//
//    }
//
//
//}
