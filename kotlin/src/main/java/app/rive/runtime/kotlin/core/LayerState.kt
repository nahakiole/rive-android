package app.rive.runtime.kotlin.core

/**
 * [LayerState]s are a baseclass for state machine layer states.
 *
 * The constructor uses a [cppPointer] to point to its c++ counterpart object.
 */
open class LayerState(val cppPointer: Long) {

    private external fun cppIsExitState(cppPointer: Long): Boolean
    private external fun cppIsAnyState(cppPointer: Long): Boolean
    private external fun cppIsEntryState(cppPointer: Long): Boolean
    private external fun cppIsAnimationState(cppPointer: Long): Boolean
    private external fun cppIsBlendState(cppPointer: Long): Boolean
    private external fun cppIsBlendStateDirect(cppPointer: Long): Boolean
    private external fun cppIsBlendState1D(cppPointer: Long): Boolean


    /**
     * Is this state an exit state
     */
    val isExitState: Boolean
        get() = cppIsExitState(cppPointer)

    /**
     * Is this state an any state
     */
    val isAnyState: Boolean
        get() = cppIsAnyState(cppPointer)

    /**
     * Is this state an entry state
     */
    val isEntryState: Boolean
        get() = cppIsEntryState(cppPointer)


    /**
     * Is this state an animation state
     */
    val isAnimationState: Boolean
        get() = cppIsAnimationState(cppPointer)

    /**
     * Is this state an animation state
     */
    val isBlendState: Boolean
        get() = cppIsBlendState(cppPointer)

    /**
     * Is this state a 1D blend state
     */
    val isBlendState1D: Boolean
        get() = cppIsBlendState1D(cppPointer)


    /**
     * Is this state an Additive blend state
     */
    val isBlendStateDirect: Boolean
        get() = cppIsBlendStateDirect(cppPointer)


    override fun toString(): String {
        return "LayerState"
    }
}
