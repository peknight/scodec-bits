package com.peknight.scodec.bits.syntax

import com.peknight.scodec.bits
import com.peknight.scodec.bits.bigint.fromUnsignedBytes
import scodec.bits.ByteVector

trait ByteVectorSyntax extends ByteVectorSyntaxPlatform:
  extension (bytes: ByteVector)
    def adjustLength(length: Int): ByteVector = bits.adjustLength(bytes, length)
    def toUnsignedBigInt: BigInt = fromUnsignedBytes(bytes)
    def leftHalf: ByteVector = bits.leftHalf(bytes)
    def rightHalf: ByteVector = bits.rightHalf(bytes)
  end extension
end ByteVectorSyntax
object ByteVectorSyntax extends ByteVectorSyntax
