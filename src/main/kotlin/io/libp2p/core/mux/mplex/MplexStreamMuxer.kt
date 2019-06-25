package io.libp2p.core.mux.mplex

import io.libp2p.core.mux.StreamMuxer
import io.libp2p.core.protocol.Mode
import io.libp2p.core.protocol.ProtocolMatcher
import io.netty.channel.Channel
import java.util.concurrent.CompletableFuture

class MplexStreamMuxer : StreamMuxer {
    override val announce = "/mplex/1.0.0"
    override val matcher: ProtocolMatcher = ProtocolMatcher(Mode.STRICT, announce, null)

    override fun activate(ch: Channel): CompletableFuture<StreamMuxer.Session> {
        TODO("not implemented")
    }
}