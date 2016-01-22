package medvedevairina.testik;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class WorkAdapter extends RecyclerView.Adapter<WorkAdapter.ViewHolder> {
        private List<Work> works;


        public static class ViewHolder extends RecyclerView.ViewHolder {
            public TextView mNameView;
            public TextView mAuthorView;

            public ViewHolder(View view) {
                super(view);
                mNameView = (TextView) view.findViewById(R.id.name);
                mAuthorView = (TextView) view.findViewById(R.id.author);
            }
        }

        public WorkAdapter(List<Work> works) {
            this.works = works;
        }

        @Override
        public WorkAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.work, parent, false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.mNameView.setText(String.valueOf(position + 1) + ". " + works.get(position).getName());
            holder.mAuthorView.setText(works.get(position).getAuthor());

        }

        @Override
        public int getItemCount() {
            return works.size();
        }
    }
