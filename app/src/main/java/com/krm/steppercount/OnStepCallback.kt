package com.krm.steppercount

interface OnStepCallback {
    fun onStep(value: Int, positive: Boolean)
}
