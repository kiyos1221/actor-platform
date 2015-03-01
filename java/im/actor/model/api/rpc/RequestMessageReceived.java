package im.actor.model.api.rpc;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.model.droidkit.bser.Bser;
import im.actor.model.droidkit.bser.BserObject;
import im.actor.model.droidkit.bser.BserValues;
import im.actor.model.droidkit.bser.BserWriter;
import static im.actor.model.droidkit.bser.Utils.*;
import java.io.IOException;
import im.actor.model.network.parser.*;
import java.util.List;
import java.util.ArrayList;
import im.actor.model.api.*;

public class RequestMessageReceived extends Request<ResponseVoid> {

    public static final int HEADER = 0x37;
    public static RequestMessageReceived fromBytes(byte[] data) throws IOException {
        return Bser.parse(new RequestMessageReceived(), data);
    }

    private OutPeer peer;
    private long date;

    public RequestMessageReceived(OutPeer peer, long date) {
        this.peer = peer;
        this.date = date;
    }

    public RequestMessageReceived() {

    }

    public OutPeer getPeer() {
        return this.peer;
    }

    public long getDate() {
        return this.date;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.peer = values.getObj(1, new OutPeer());
        this.date = values.getLong(3);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        if (this.peer == null) {
            throw new IOException();
        }
        writer.writeObject(1, this.peer);
        writer.writeLong(3, this.date);
    }

    @Override
    public String toString() {
        String res = "rpc MessageReceived{";
        res += "peer=" + this.peer;
        res += ", date=" + this.date;
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}
