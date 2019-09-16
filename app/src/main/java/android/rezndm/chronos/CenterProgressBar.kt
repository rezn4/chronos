package android.rezndm.chronos

import android.content.Context
import android.util.AttributeSet
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout


class CenterProgressBar(context: Context, attributeSet: AttributeSet) : ConstraintLayout(context, attributeSet){

    init {
        inflate(context, R.layout.centerprogressbar, this)

        val circularBlack = findViewById<ImageView>(R.id.circular_border_black)
        val rotateLeftAnim = AnimationUtils.loadAnimation(context, R.anim.progress_left)
        circularBlack.startAnimation(rotateLeftAnim)

        val circularGray = findViewById<ImageView>(R.id.circular_border_gray)
        val rotateRightAnim = AnimationUtils.loadAnimation(context, R.anim.progress_right)
        circularGray.startAnimation(rotateRightAnim)
    }
}