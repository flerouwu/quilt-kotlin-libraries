/*
 * DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen
 *
 * Copyright 2023 QuiltMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.quiltmc.qkl.library.math

import net.minecraft.util.math.Vec3d
import org.joml.Vector3d
import kotlin.math.sqrt

//region Standard math operators
/**
 * Adds a [Vec3d] to a [Vec3d].
 */
public operator fun Vec3d.plus(other: Vec3d): Vec3d {
    return Vec3d(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [Vec3d] from a [Vec3d].
 */
public operator fun Vec3d.minus(other: Vec3d): Vec3d {
    return Vec3d(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [Vec3d] and a [Vec3d].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vec3d.times(other: Vec3d): Vec3d {
    return Vec3d(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}

/**
 * Negates a [Vec3d].
 */
public operator fun Vec3d.unaryMinus(): Vec3d {
    return Vec3d(
        -this.x,
        -this.y,
        -this.z
    )
}
//endregion

//region Type compatibility operator variations
/**
 * Adds a [Vector3d] to a [Vec3d].
 */
public operator fun Vec3d.plus(other: Vector3d): Vec3d {
    return Vec3d(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [Vector3d] from a [Vec3d].
 */
public operator fun Vec3d.minus(other: Vector3d): Vec3d {
    return Vec3d(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [Vector3d] and a [Vec3d].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vec3d.times(other: Vector3d): Vec3d {
    return Vec3d(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}
//endregion

//region Vector specific operators
/**
 * Divides a [Vec3d] and a Double.
 */
public operator fun Vec3d.div(other: Double): Vec3d {
    return Vec3d(
        this.x / other,
        this.y / other,
        this.z / other
    )
}

/**
 * Returns the normalized version of this vector.
 */
public fun Vec3d.normalized(): Vec3d {
    val length = sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z))
    return Vec3d(
        this.x / length,
        this.y / length,
        this.z / length
    )
}

/**
 * The [`x`][Vec3d.x] of a [Vec3d].
 */
public operator fun Vec3d.component1(): Double {
    return this.x
}

/**
 * The [`y`][Vec3d.y] of a [Vec3d].
 */
public operator fun Vec3d.component2(): Double {
    return this.y
}

/**
 * The [`z`][Vec3d.z] of a [Vec3d].
 */
public operator fun Vec3d.component3(): Double {
    return this.z
}

/**
 * Returns the dot product of a [Vec3d] and a [Vector3d].
 */
public infix fun Vec3d.dot(other: Vector3d): Double {
    return (this.x * other.x) + (this.y * other.y) + (this.z * other.z)
}

/**
 * Returns the dot product of a [Vec3d] and a [Vec3d].
 */
public infix fun Vec3d.dot(other: Vec3d): Double {
    return (this.x * other.x) + (this.y * other.y) + (this.z * other.z)
}

/**
 * Returns the cross product of a [Vec3d] and a [Vector3d].
 */
public infix fun Vec3d.cross(other: Vector3d): Vec3d {
    return Vec3d(
        (this.y * other.z) - (this.z * other.y),
        (this.z * other.x) - (this.x * other.z),
        (this.x * other.y) - (this.y * other.x),
    )
}

/**
 * Returns the cross product of a [Vec3d] and a [Vec3d].
 */
public infix fun Vec3d.cross(other: Vec3d): Vec3d {
    return Vec3d(
        (this.y * other.z) - (this.z * other.y),
        (this.z * other.x) - (this.x * other.z),
        (this.x * other.y) - (this.y * other.x),
    )
}
//endregion

//region Conversion methods
/**
 * Converts a [Vec3d] to a [Vector3d].
 */
public fun Vec3d.toVector3d(): Vector3d {
    return Vector3d(
        this.x,
        this.y,
        this.z
    )
}
//endregion