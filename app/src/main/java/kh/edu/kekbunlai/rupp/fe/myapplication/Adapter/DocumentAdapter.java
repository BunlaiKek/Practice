package kh.edu.kekbunlai.rupp.fe.myapplication.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import kh.edu.kekbunlai.rupp.fe.myapplication.R;

/**
 * Created by Kek Bunlai on 26-Apr-17.
 */

public class DocumentAdapter extends RecyclerView.Adapter<DocumentAdapter.DocumentViewHolder> {
    private  Document[] documents;

    public DocumentAdapter( Document[] documents)
    {
        this.documents = documents;
    }
    public void setDocuments(Document[] documents)
    {
        this.documents =documents;
        notifyDataSetChanged();
    }
    @Override
    public DocumentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View holder = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_document,parent,false);
        DocumentViewHolder documentViewHolder = new DocumentViewHolder(holder);
        return documentViewHolder;
    }

    @Override
    public void onBindViewHolder(DocumentViewHolder holder,  int position) {
        Document document = documents[position];
        //set dataset to view holder
        holder.txtTitle.setText(document.getTitle());
        holder.txtSize.setText(String.valueOf(document.getSize()));

    }

    @Override
    public int getItemCount() {
        return documents.length;
    }

    class DocumentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        public ImageView imgThumnail;
        public TextView txtTitle;
        public TextView txtSize;

        public DocumentViewHolder(View itemView) {
            super(itemView);
            imgThumnail = (ImageView)itemView.findViewById(R.id.img_thumnail);
            txtTitle = (TextView)itemView.findViewById(R.id.txt_title);
            txtSize = (TextView)itemView.findViewById(R.id.txt_size);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
