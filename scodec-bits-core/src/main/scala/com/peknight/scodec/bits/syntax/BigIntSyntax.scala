package com.peknight.scodec.bits.syntax

import com.peknight.scodec.bits.bigint
import scodec.bits.ByteVector

trait BigIntSyntax:
  extension (bigInt: BigInt)
    def toUnsignedBytes: ByteVector = bigint.toUnsignedBytes(bigInt)
    def toUnsignedBytes(minLength: Int): ByteVector = bigint.toUnsignedBytes(bigInt, minLength)
    def toByteVector: ByteVector = bigint.toByteVector(bigInt)
  end extension
end BigIntSyntax
object BigIntSyntax extends BigIntSyntax
