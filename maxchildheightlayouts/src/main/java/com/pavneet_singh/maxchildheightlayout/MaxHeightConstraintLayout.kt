package com.pavneet_singh.maxchildheightlayout

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.math.max

/**
 * Created by Pavneet_Singh on 2020-02-23.
 */

class MaxHeightConstraintLayout @kotlin.jvm.JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var _maxHeight: Int = 0

    // required to support the minHeight attribute
    private var _minHeight = attrs?.getAttributeValue(
        "http://schemas.android.com/apk/res/android",
        "minHeight"
    )?.substringBefore(".")?.toInt() ?: 0

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            _minHeight = minHeight
        }

        val maxValue = max(_maxHeight, max(height, _minHeight))

        if (maxValue != 0 && maxValue > minHeight) {
            minHeight = maxValue
        }
        _maxHeight = maxValue
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

}