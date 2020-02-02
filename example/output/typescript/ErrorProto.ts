// Code generated by Webpb compiler, do not edit.
// https://github.com/jg513/webpb

import * as $protobuf from "protobufjs";
import { Webpb } from 'webpb';

const $Reader = $protobuf.Reader, $Writer = $protobuf.Writer, $util = $protobuf.util;

export namespace ErrorProto {
    export enum ErrorCode {
        OK = 0,
        ERROR = 1,
    }

    export interface IErrorMessage {
        code: ErrorProto.ErrorCode;
        message?: string;
    }

    export class ErrorMessage implements IErrorMessage {
        code!: ErrorProto.ErrorCode;
        message?: string;
        META: () => Webpb.WebpbMeta;

        private constructor(p?: IErrorMessage) {
            Webpb.assign(p, this, []);
            this.META = () => (p && {
                class: 'ErrorMessage',
                method: '',
                path: ''
            });
        }

        static create(properties: IErrorMessage): ErrorMessage {
            return new ErrorMessage(properties);
        }

        static encode(message: IErrorMessage, writer?: $protobuf.Writer): $protobuf.Writer {
            writer || (writer = $Writer.create());
            writer.uint32(8).int32(message.code);
            if (message.message != null && message.hasOwnProperty("message")) {
                writer.uint32(18).string(message.message);
            }
            return writer;
        }

        static encodeDelimited(message: IErrorMessage, writer?: $protobuf.Writer): $protobuf.Writer {
            return this.encode(message, writer).ldelim();
        }

        static decode(reader: ($protobuf.Reader | Uint8Array), length?: number): ErrorProto.ErrorMessage {
            (reader instanceof $Reader) || (reader = $Reader.create(reader));
            let end = length === undefined ? reader.len : reader.pos + length;
            let message = new ErrorProto.ErrorMessage();
            while (reader.pos < end) {
                const tag = reader.uint32();
                switch (tag >>> 3) {
                    case 1: {
                        message.code = reader.int32();
                        break;
                    }
                    case 2: {
                        message.message = reader.string();
                        break;
                    }
                    default:
                        reader.skipType(tag & 7);
                        break;
                }
                if (!message.hasOwnProperty("code")) {
                    throw $util.ProtocolError("missing required 'code'", { instance: message });
                }
            }
            return message;
        }

        static decodeDelimited(reader: ($protobuf.Reader | Uint8Array)): ErrorProto.ErrorMessage {
            (reader instanceof $Reader) || (reader = new $Reader(reader));
            return this.decode(reader, reader.uint32());
        }

        static toObject(message: IErrorMessage, options?: $protobuf.IConversionOptions): { [k: string]: any } {
            options || (options = {});
            let obj : { [k: string]: any } = {};
            if (options.defaults) {
                obj.code = options.enums === String ? "OK" : 0;
                obj.message = "";
            }
            if (message.code != null && message.hasOwnProperty("code")) {
                obj.code = options.enums === String ? ErrorProto.ErrorCode[message.code] : message.code;
            }
            if (message.message != null && message.hasOwnProperty("message")) {
                obj.message = message.message;
            }
            return obj;
        }

        toJSON(): { [k: string]: any } {
            return ErrorProto.ErrorMessage.toObject(this, $protobuf.util.toJSONOptions);
        }
    }
}
